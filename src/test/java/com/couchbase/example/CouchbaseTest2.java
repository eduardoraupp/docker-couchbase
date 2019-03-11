package com.couchbase.example;

import org.junit.Assert;
import org.junit.Test;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

public class CouchbaseTest2 extends ParentTest {

	@Test
	public void test3() {
		System.out.println("TEST EDUARDO");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Eduardo").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("eduardo", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("eduardo").content().get("lastname");
		Assert.assertEquals(lastname, "Raupp");
		System.out.println("hahaha");
	}

	@Test
	public void test4() {
		System.out.println("TEST EDUARDO");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Eduardo").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("eduardo", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("eduardo").content().get("lastname");
		Assert.assertEquals(lastname, "Raupp");
		System.out.println("hahaha");
	}

	@Test
	public void test5() {
		System.out.println("TEST EDUARDO");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Eduardo").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("eduardo", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("eduardo").content().get("lastname");
		Assert.assertEquals(lastname, "Raupp");
		System.out.println("hahaha");
	}

	@Test
	public void test6() {
		System.out.println("TEST EDUARDO");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Eduardo").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("eduardo", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("eduardo").content().get("lastname");
		Assert.assertEquals(lastname, "Raupp");
		System.out.println("hahaha");
	}

	@Test
	public void test7() {
		System.out.println("TEST EDUARDO");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Eduardo").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("eduardo", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("eduardo").content().get("lastname");
		Assert.assertEquals(lastname, "Raupp");
		System.out.println("hahaha");
	}

	@Test
	public void test8() {
		System.out.println("TEST EDUARDO");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Eduardo").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("eduardo", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("eduardo").content().get("lastname");
		Assert.assertEquals(lastname, "Raupp");
		System.out.println("hahaha");
	}

	@Test
	public void test9() {
		System.out.println("TEST EDUARDO");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Eduardo").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("eduardo", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("eduardo").content().get("lastname");
		Assert.assertEquals(lastname, "Raupp");
		System.out.println("hahaha");
	}

}
