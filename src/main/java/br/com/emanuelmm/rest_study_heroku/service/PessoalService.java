package br.com.emanuelmm.rest_study_heroku.service;

import java.util.Arrays;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Emanuel Cordeiro
 */
@Path("funcionarios")
public class PessoalService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List< String> buscarTodos() {
        return Arrays.asList("Pedro", "Thiago", "João");
    }
    
}
