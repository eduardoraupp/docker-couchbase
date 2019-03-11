package com.couchbase.example;

import org.junit.Assert;
import org.junit.Test;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

public class CouchbaseTest3 extends ParentTest {
	
	@Test
	public void test3() {
		System.out.println("TEST SUELLEN");
		Cluster cluster = CouchbaseCluster.create();
		Bucket bucket = cluster.openBucket("test", "123456");
		JsonObject user = JsonObject.empty().put("firstname", "Suellen").put("lastname", "Raupp")
				.put("job", "chemistry teacher").put("age", 50);
		JsonDocument doc = JsonDocument.create("suellen", user);
		bucket.insert(doc);
		String firstname = (String) bucket.get("suellen").content().get("firstname");
		Assert.assertEquals(firstname, "Suellen");
		System.out.println("hehehe");
	}

	
}
