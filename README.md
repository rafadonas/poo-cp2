# FiapDelivery - Sistema de Logística

## Visão Geral
O FiapDelivery é um sistema de logística orientado a objetos, projetado para gerenciar entregas de pacotes utilizando diferentes tipos de veículos. O projeto foi refatorado para seguir boas práticas de Engenharia de Software, como encapsulamento, reutilização de código via herança e flexibilidade na associação entre classes.

## Estrutura de Classes

- **Vehicle (abstract)**: Classe abstrata que representa um veículo genérico. Possui atributos comuns como placa e capacidade, além de métodos de acesso e validação. Serve como base para outros tipos de veículos.
  - **Truck**: Herda de `Vehicle`. Adiciona o atributo de número de eixos.
  - **Motorcycle**: Herda de `Vehicle`. Adiciona o atributo de presença de baú (trunk).
- **PackageItem**: Representa um pacote a ser entregue, com código, peso e status. Possui métodos para alterar e validar o status.
- **Route**: Associa um pacote (`PackageItem`) a um veículo (`Vehicle`), permitindo a entrega de pacotes por qualquer tipo de veículo.
- **Main**: Classe principal para execução de exemplos e testes do sistema.

## Conceitos Utilizados
- **Encapsulamento**: Todos os atributos são privados, acessados por getters/setters, garantindo integridade dos dados.
- **Herança**: `Truck` e `Motorcycle` herdam de `Vehicle`, evitando duplicação de código.
- **Polimorfismo**: A classe `Route` aceita qualquer objeto do tipo `Vehicle`, permitindo flexibilidade na escolha do veículo para entrega.
- **Validação**: Métodos de validação nos setters para evitar dados inválidos (ex: capacidade negativa, código vazio).
- **Responsabilidade Única**: Cada classe tem uma responsabilidade clara e bem definida.

## Como Executar
1. Compile todos os arquivos `.java`:
   ```
   javac *.java
   ```
2. Execute a classe principal:
   ```
   java Main
   ```

## Exemplo de Saída
```
Delivering BR999 using Truck ABC1234
Delivering BR100 using Motorcycle MOTO1
```

## Possíveis Extensões
- Adicionar novos tipos de veículos facilmente, bastando herdar de `Vehicle`.
- Implementar novas regras de entrega ou restrições por tipo de veículo.
- Persistência de dados e interface gráfica.

---
Projeto desenvolvido para fins didáticos, demonstrando princípios de POO aplicados a um sistema de logística.
