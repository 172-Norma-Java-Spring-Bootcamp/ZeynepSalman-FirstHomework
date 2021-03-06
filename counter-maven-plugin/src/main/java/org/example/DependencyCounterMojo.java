package org.example;

import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.List;

/*"goal" adi: dependency-counter
  bu hedefi derleme asamasina varsayilan olarak ekledik,
  bu yuzden bu hedefi kullanirken bir asama belirtmemiz gerekmeyecek.*/
@Mojo(name = "dependency-counter", defaultPhase = LifecyclePhase.COMPILE)
public class DependencyCounterMojo extends AbstractMojo {

    //Proje bilgilerine erisebilmek icin parametre olarak bir MavenProject eklememiz gerek
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    MavenProject project;

    //kullanicilarin saymak istedigimiz bagımliliklarin kapsamini belirleyebilecekleri bir parametre
    @Parameter(property = "scope")
    String scope;

    //sayarken bagimliliklari filtreleyecegiz:
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        List<Dependency> dependencies = project.getDependencies();
        long numDependencies = dependencies.stream()
                .filter(d -> (scope == null || scope.isEmpty()) || scope.equals(d.getScope()))
                .count();
        getLog().info("number of dependencies: " + numDependencies);
    }
}
