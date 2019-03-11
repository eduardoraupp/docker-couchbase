package com.couchbase.example;

import org.junit.Assert;
import org.junit.Test;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

public class CouchbaseTest extends ParentTest {

	@Test
	public void test1() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	
	@Test
	public void test2() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	
	@Test
	public void test4() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	
	@Test
	public void test5() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	@Test
	public void test6() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	@Test
	public void test7() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	@Test
	public void test8() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	@Test
	public void test9() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}
	@Test
	public void test10() {
		System.out.println("TEST WALTER");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Walter").put("lastname", "White")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("walter", user);
		bucket.upsert(doc);
		String lastname = (String) bucket.get("walter").content().get("lastname");
		Assert.assertEquals(lastname, "White");
		System.out.println("TESTED");
	}

}
