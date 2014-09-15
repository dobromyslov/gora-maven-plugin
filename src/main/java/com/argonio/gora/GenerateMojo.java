package com.argonio.gora;

import java.io.File;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

/**
 * Goal which compiles Gora schemas.
 *
 */
@Mojo(name = "generate", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class GenerateMojo extends AbstractGoraMojo {
    /**
     * The source directory of Apache Avro files. This directory is added to the
     * classpath at schema compiling time. All files can therefore be referenced
     * as classpath resources following the directory structure under the source
     * directory.
     *
     */
    @Parameter(defaultValue = "${basedir}/src/main/avro")
    private File sourceDirectory;

    @Parameter(defaultValue = "${basedir}/src/main/java")
    private File outputDirectory;

    @Override
    protected File getSourcesDirectory() {
        return sourceDirectory;
    }

    @Override
    protected File getOutputDirectory() {
        return outputDirectory;
    }

    @Override
    protected void registerSourceDirectory(MavenProject project, String path) {
        project.addCompileSourceRoot(path);
    }
}