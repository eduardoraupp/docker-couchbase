package com.couchbase.example;

import java.io.File;

import org.junit.BeforeClass;
import org.testcontainers.containers.DockerComposeContainer;

public abstract class ParentTest {
	/*
	 * @ClassRule public static DockerComposeContainer environment = new
	 * DockerComposeContainer<>(new File("docker-compose.yml"))
	 * .withExposedService("couchbase-test", 8091) .withLocalCompose(true);
	 */
	
	public static final DockerComposeContainer environment = new DockerComposeContainer<>(new File("src/test/resources/docker-compose.yml"))
			.withExposedService("couchbase-test", 8091).withLocalCompose(true);
	static {
		environment.start();
	}
	
	@BeforeClass
	public static void timeOut() throws InterruptedException {
		Thread.sleep(5000);
	}

	
}
