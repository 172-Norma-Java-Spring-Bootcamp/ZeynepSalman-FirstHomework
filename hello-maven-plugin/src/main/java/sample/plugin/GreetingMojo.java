package sample.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {
    //Mojo, plugin'inin yurutecegi bir hedefi temsil eden bir Java sinifidir.
    //Bir plugin bir veya daha fazla mojo icerir.
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello world");
    }
}
