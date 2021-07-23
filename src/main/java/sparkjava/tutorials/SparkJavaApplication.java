package sparkjava.tutorials;

import static spark.Spark.*;

public class SparkJavaApplication {

	public static void main(String[] args) {
		get("/hello-world", (req,res) -> "Say Hello to Spark Java. A micro framework");
	}

}
