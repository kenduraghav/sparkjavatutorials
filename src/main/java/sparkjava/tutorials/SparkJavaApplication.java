package sparkjava.tutorials;

import static spark.Spark.*;

public class SparkJavaApplication {

	public static void main(String[] args) {
		get("/hello-world", (req,res) -> "Runtime changing. Say Hello to Spark Java. A micro framework");
	}

}
