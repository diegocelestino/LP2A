package com.exservlet.models;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Contatos {
    public static List<Map<String, Object>> contatos = new ArrayList<>();

    static {
        Map<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("nome", "Diego");
        concurrentHashMap.put("endereco", "rua dos bobos, 0");
        concurrentHashMap.put("email", "diego@diego.com");
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(Date.from(Instant.now()));
        concurrentHashMap.put("dataNascimento", dataNascimento);

        Contatos.contatos.add(concurrentHashMap);
    }

    public static List<Contato> to(){
        List<Contato> contatoList = new ArrayList<>();
        for (Map<String, Object> map: contatos) {
            Contato contato = new Contato();
            contato.setNome((String)map.get("nome"));
            contato.setEndereco((String)map.get("endereco"));
            contato.setEmail((String)map.get("email"));
            contato.setDataNascimento((Calendar) map.get("dataNascimento"));

            contatoList.add(contato);
        }

        return contatoList;
    }

    public Object getTo() {
        return to();
    }
}
