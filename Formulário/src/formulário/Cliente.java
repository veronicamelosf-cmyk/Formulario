/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulário;

/**
 *
 * @author veronica62924506
 */

public class Cliente {

    private String Codigo;
    private String Nome;
    private String Contato;
    private String CPF;
    private String RG;
    private String CNPJ;
    private String dataNascimento;
    private String inscricaoEstadual;
    private String Endereco;
    private String Numero;
    private String Complemento;
    private String CEP;
    private String Bairro;
    private String Cidade;
    private String Sexo;
    private String Celular;
    private String Email;
    private String ConfirmarSenha;

    public Cliente(
            String Codigo,
            String Nome,
            String Contato,
            String CPF,
            String RG,
            String CNPJ,
            String dataNascimento,
            String inscricaoEstadual,
            String Endereco,
            String Numero,
            String Complemento,
            String CEP,
            String Bairro,
            String Cidade,
            String Sexo,
            String Celular,
            String Email,
            String ConfirmarSenha) {

        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Contato = Contato;
        this.CPF = CPF;
        this.RG = RG;
        this.CNPJ = CNPJ;
        this.dataNascimento = dataNascimento;
        this.inscricaoEstadual = inscricaoEstadual;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Complemento = Complemento;
        this.CEP = CEP;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Sexo = Sexo;
        this.Celular = Celular;
        this.Email = Email;
        this.ConfirmarSenha = ConfirmarSenha;
    }
}


