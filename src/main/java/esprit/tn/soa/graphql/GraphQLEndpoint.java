package esprit.tn.soa.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import esprit.tn.soa.repository.StudentRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;


@WebServlet(urlPatterns ="/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

		public GraphQLEndpoint(){
			super(buildSchema());
		}
	
		private static GraphQLSchema buildSchema(){
			
			StudentRepository studenrepo = new StudentRepository();
			esprit.tn.soa.repository.LogementRepository lr = new esprit.tn.soa.repository.LogementRepository();
	    	esprit.tn.soa.repository.RendezVousRepository rdvRepo = new esprit.tn.soa.repository.RendezVousRepository();
			return SchemaParser.newParser()
					.file("schema.graphqls")
					.resolvers(new Query(studenrepo),new Mutation(lr,rdvRepo))
					.build()
					.makeExecutableSchema();
		}
}
