
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.json.JsonArray;
import javax.json.JsonObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tux
 */
@Named
@RequestScoped
public class AcBean {
    private List<Json> list;
    
    
    class Json {
        private String nome;
        private String idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getIdade() {
            return idade;
        }

        public void setIdade(String idade) {
            this.idade = idade;
        }

        public Json(String nome, String idade) {
            this.nome = nome;
            this.idade = idade;
        }
        
           
    }
    
    
    @PostConstruct
    private void onInit(){
        Json j1 = new Json("Ai saulinho" , "24");
        Json j2 = new Json("Cavalo", "25");
        Json j3  = new Json("Cagurus esvoazantes" , "25");
        list = new ArrayList<>();
        list.add(j1);list.add(j2);list.add(j3);
        
    }
    
    
    public void add(ActionEvent evt){
        list.add(new Json("David zé ruela", "24"));
    }
    
    public String getJson(){
       return new Gson().toJson(list);
    }
}
