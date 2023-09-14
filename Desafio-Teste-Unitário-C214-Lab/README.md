# DesafioTesteUnitário

Codigo da Aula 5 do Lab de C214, fazendo implementações de Testes Unitários usando funcionalidades da Calculadora de IMC vista em aula.

Este projeto é uma implementação de uma Calculadora de Índice de Massa Corporal (IMC). A calculadora possui funcionalidades para calcular o IMC, avaliar a condição física com base no IMC e calcular o peso ideal com base na altura e no sexo.

## Funcionalidades:

Cálculo do IMC: A função calcularIMC calcula o IMC com base no peso (em quilogramas) e na altura (em centímetros). Ele verifica se as entradas são válidas e retorna o IMC com duas casas decimais.

Avaliação de Saúde: A função healthCheck recebe o IMC como entrada e fornece uma avaliação da condição física com base nas faixas de IMC. Ele orienta o usuário com mensagens personalizadas de acordo com o resultado do cálculo do IMC.

Cálculo de Peso Ideal: A função calculateWeight calcula o peso ideal com base na altura (em centímetros) e no sexo. Ele utiliza fórmulas específicas para determinar o peso ideal para homens e mulheres e retorna o valor arredondado com duas casas decimais.

## Executando o Projeto:

1. Navegue até a pasta raiz do projeto:

```bash
cd DesafioTesteUnitario
```

2. Instale as dependências do projeto usando o npm:

```bash
npm i
```

3. Execute os Testes unitários:

```bash
npm test
```

## Recursos Principais:

- Cálculo preciso do IMC com validações de entrada.
- Avaliação da condição física com base em faixas de IMC.
- Cálculo de peso ideal com base na altura e no sexo.
- Testes unitários para garantir a funcionalidade correta do código.
