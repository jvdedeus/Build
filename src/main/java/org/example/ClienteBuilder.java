package org.example;

public class ClienteBuilder {

    private Cliente cliente;

    public ClienteBuilder(){
        cliente = new Cliente();
    }

    public Cliente build(){
        if (cliente.getEmail().equals("")) {
            throw new IllegalArgumentException("Email inválido");
        }
        if (cliente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return cliente;
    }

    public ClienteBuilder setNome(String nome){
        cliente.setNome(nome);
        return this;
    }

    public ClienteBuilder setEmail(String email){
        cliente.setEmail(email);
        return this;
    }

    public ClienteBuilder setTelefone(String telefone){
        cliente.setTelefone(telefone);
        return this;
    }

    public ClienteBuilder setCpf(String cpf){
        cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder setEnderecoNumero(Integer enderecoNumero){
        cliente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ClienteBuilder setEnderecoComplemento(String enderecoComplemento){
        cliente.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public ClienteBuilder setEnderecoLogradouro(String enderecoLogradouro){
        cliente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ClienteBuilder setEnderecoBairro(String enderecoBairro){
        cliente.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public ClienteBuilder setEnderecoCidade(String enderecoCidade){
        cliente.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public ClienteBuilder setEnderecoUF(String enderecoUF){
        cliente.setEnderecoUF(enderecoUF);
        return this;
    }

    public ClienteBuilder setCep(String cep){
        cliente.setCep(cep);
        return this;
    }
}
