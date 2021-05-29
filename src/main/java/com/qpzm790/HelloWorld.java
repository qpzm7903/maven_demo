package com.qpzm790;

import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.util.List;

@Mojo(name = "hello")
public class HelloWorld extends AbstractMojo {
    @Parameter(property = "hello.greeting", defaultValue = "hello , maven plugin world")
    private String greeting;

    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("-----------------------");
        getLog().info(greeting);
        MavenProject mavenProject = (MavenProject) this.getPluginContext().get("project");

        List<Dependency> dependencies = mavenProject.getDependencies();
        dependencies.forEach(this::showDependencyInfo);
        this.getPluginContext().get("project");
        getLog().info("-----------------------");
    }

    private void showDependencyInfo(Dependency dependency) {
        getLog().info(dependency.toString());

    }
}
