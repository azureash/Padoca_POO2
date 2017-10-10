# Padoca_POO2

Sistema de controle de padaria para aula de POO 2

Membros:
Marina Percebão - RA 174164 

Tomas Moreira D'Alessandro - RA 177754 (Turma A)

Vitor Eduardo Lopes Paulella - RA 140976

Vinicius Rocha Fernandes Inacio - RA 149046

Objetivo:
Este projeto tem por objetivo focar em microempreendedores que trabalha com padarias. Automatizar os sistema de vendas facilitando da melhor maneira o uso para os usuários, que neste caso serão os funcionários, de forma que este venha colaborar e agilizar a venda dos  produtos de forma  simplificada.

Requisitos:
1. Inserir Produto 
2. Listar Produto 
3. Comprar 
4. Ver Carrinho 
5. Atualizar Estoque
6. Imprimir Estoue
7. Finalizar Compra

Classes:

1. Classe Produto:
   
   id_prod, nome_prod, qtd_prod, lista_prod.

   Insere Produto //Da entrada de produtos no sistema até o usuário decidir parar
   
   Lista Produto //Lista o estoque de produtos cadastrados

2. Classe Compra:

   id_compra, qtd_compra, lista_carrinho, imprime_compra, total_carrinho.

   Comprar //Usuário da entrada em cada produto sendo comprado
   
   Ver Carrinho //Imprime na tela os produtos comprados
   
   Finalizar Compra //Imprime em um arquivo .txt o subtotal da compra

3. Classe Estoque:

   imprime_estoque, atualiza_estoque

   Atualizar Estoque //Atualiza o estoque listado subtraindo dos valores comprados
   
   Imprimir Estoque //Imprime em um arquivo .txt 
