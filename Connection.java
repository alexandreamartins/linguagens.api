package br.com.alura.linguagens.api;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class Connection {
	
	ConnectionString connectionString = new ConnectionString("mongodb+srv://cerebro:JCGM06!!*#@cluster0.jn8wcdp.mongodb.net/?retryWrites=true&w=majority");
	MongoClientSettings settings = MongoClientSettings.builder()
	        .applyConnectionString(connectionString)
	        .serverApi(ServerApi.builder()
	            .version(ServerApiVersion.V1)
	            .build())
	        .build();
	MongoClient mongoClient = MongoClients.create(settings);
	MongoDatabase database = mongoClient.getDatabase("aluraDb");
	
	
	
	
	public static void main(String args[]) {
			
			
		
			Connection conexao = new Connection();
			conexao.hashCode();
	}
}

