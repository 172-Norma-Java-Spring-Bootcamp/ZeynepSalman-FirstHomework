package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {
    //. Mojo, eklentimizin yürüteceği bir hedefi temsil eden bir Java sınıfıdır . Bir eklenti bir veya daha fazla mojo içerir.
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello world");
    }
}
