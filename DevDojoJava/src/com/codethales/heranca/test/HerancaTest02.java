package com.codethales.heranca.test;

import com.codethales.heranca.domainmodel.Funcionario;

/*         --- ORDEM DE EXECUÇÃO QUANDO HÁ HERANÇA ---
 *   SUPER CLASSE - Pessoa.
 *   CLASSE FILHA - Funcionario.
 *
 * 01 - É executado o bloco de inicialização static da super classe qndo a JVM carregar a super classe;
 * 02 - É executado o bloco de inicialização static da classe filha qndo a JVM carregar a classe filha;
 * 03 - Alocado espaço em memória para o objeto da super classe;
 * 04 - São criados e inicializados os atributos da super classe;
 * 05 - São executados todos os bloco de inicialização NÃO static da super classe na ordem em que aparecem;
 * 06 - É executado o construtor da super classe;
 * 07 - Alocado espaço em memória para o objeto da classe filha;
 * 08 - São criados e inicializados os atributos da classe filha;
 * 09 - São executados todos os bloco de inicialização NÃO static da classe filha;
 * 10 - É executado o construtor da classe filha.
 */

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
