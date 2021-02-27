package com.qpzm790;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "hello")
public class HelloWorld extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello maven plugin world");
    }
}
