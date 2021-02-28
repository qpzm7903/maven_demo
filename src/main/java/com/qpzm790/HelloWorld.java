package com.qpzm790;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "hello")
public class HelloWorld extends AbstractMojo {
    @Parameter(property = "hello.greeting", defaultValue = "hello , maven plugin world")
    private String greeting;

    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info(greeting);
    }
}
