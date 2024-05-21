# Contador de Números
Este projeto foi desenvolvido como parte do Bootcamp Santander com a DIO. O objetivo do projeto é criar um contador de números que solicita ao usuário dois parâmetros e imprime todos os números entre esses dois valores. Se o primeiro valor for maior que o segundo, uma exceção personalizada é lançada.

## Funcionalidades

- Solicita ao usuário dois números inteiros.

- Imprime todos os números entre os dois valores informados.

- Lança uma exceção se o primeiro número for maior que o segundo.

## Estrutura do Projeto
O projeto contém uma classe principal Contador e uma exceção personalizada ParametrosInvalidosException.

## Classe `Contador`

- main(String[] args): Método principal que executa o programa.
- entrarComNumeroParametroUm(): Solicita ao usuário o primeiro número.
- entrarComNumeroParametroDois(): Solicita ao usuário o segundo número.
- contar(int parametroUm, int parametroDois): Realiza a contagem e lança uma exceção se os parâmetros forem inválidos.

## Classe ParametrosInvalidosException

Uma classe de exceção personalizada que é lançada quando o segundo parâmetro é menor que o primeiro.
