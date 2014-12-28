package br.com.emanuelmm.rest_study_heroku.service;

import br.com.emanuelmm.rest_study_heroku.entity.Funcionario;
import br.com.emanuelmm.rest_study_heroku.jpa.FuncionarioJPA;
import java.util.Arrays;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Emanuel Cordeiro
 */
@Path("funcionarios")
@ManagedBean
public class PessoalService {
    
    @Inject
    FuncionarioJPA funcionarioJPA;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List< String> buscarTodos() {
        return Arrays.asList("Pedro", "Thiago", "João");
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Funcionario buscarPorId(@PathParam("id") int id) {
        return funcionarioJPA.buscarPorId(id);
    }

}
