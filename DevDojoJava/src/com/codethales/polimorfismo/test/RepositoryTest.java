package com.codethales.polimorfismo.test;

import com.codethales.polimorfismo.repository.Repository;
import com.codethales.polimorfismo.service.DataBaseRepository;
import com.codethales.polimorfismo.service.FileRepository;
import com.codethales.polimorfismo.service.MemoryRepository;

public class RepositoryTest {
    public static void main(String[] args) {

        /*
        * Esse tipo de design facilita a manutenção do código.
        * Uma vez que crio uma variável de instância de um tipo mais genérico, fica fácil trocar o tipo de implementação.
        * No exemplo abaixo eu tenho diferentes tipos de acesso a determinados repositórios.
        * Imagine que o cód esteja pronto, e seja solicitado trocar o repositório que deve ser acessado. Para isso
        * basta trocar o objeto, mantendo assim tanto a variável quando o restante do código inalterados.
        * */
        Repository repository = new DataBaseRepository();
        Repository repository2 = new FileRepository();
        Repository repository3 = new MemoryRepository();

        repository.save();
        repository2.save();
        repository3.save();


    }
}
