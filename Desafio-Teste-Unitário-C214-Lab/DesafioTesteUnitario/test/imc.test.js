const { expect } = require("chai");
const { calcularIMC, healthCheck, calculateWeight } = require("../src/imc");

describe("Calculadora de IMC", () => {
  it("Fazendo calculo do IMC!", () => {
    const peso = 80; // 80 kg
    const altura = 180; // 180 cm

    const expectedIMC = (peso / Math.pow(altura / 100, 2)).toFixed(2);
    const calculatedIMC = calcularIMC(peso, altura);

    expect(calculatedIMC).to.equal(expectedIMC);
  });

  it("Altura ou Peso impossíveis. Entradas inadequadas!", () => {
    let peso = 400; // 400 kg
    let altura = 0;

    let IMC = calcularIMC(peso, altura);

    expect(IMC).to.equal("NaN");

    peso = 0;
    altura = 280; // 280 cm

    IMC = calcularIMC(peso, altura);

    expect(IMC).to.equal("NaN");
  });

  it("Consultando tabela de ajuda para Peso Normal!", () => {
    const peso = 80; // 80 kg
    const altura = 180; // 180 cm
    const calculatedIMC = calcularIMC(peso, altura);

    const description =
      "Você está no Peso ideal. Continue mantendo-se em forma!";

    expect(description).to.equal(healthCheck(calculatedIMC));
  });

  it("Consultando tabela de ajuda para Obesidade Grau 2!", () => {
    const peso = 105;
    const altura = 170;
    const calculatedIMC = calcularIMC(peso, altura);

    const description =
      "Você está com Obesidade grau 2. Favor Consultar um médico!";

    expect(description).to.equal(healthCheck(calculatedIMC));
  });

  it("Consultando Peso Ideal baseado no Sexo.", () => {
    const altura = 170;
    let sexo = "Masculino";

    const pesoIdealM = parseFloat(calculateWeight(altura, sexo));
    expect(65.83).to.equal(pesoIdealM);

    sexo = "Feminino";
    const pesoIdealF = parseFloat(calculateWeight(altura, sexo));
    expect(65.74).to.equal(pesoIdealF);
  });
});
