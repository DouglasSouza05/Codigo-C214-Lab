function calcularIMC(peso, altura) {
  if (altura <= 0 || peso <= 0) {
    return "NaN"; // Retorna "NaN" se a Altura ou Peso for igual a zero
  }

  if (altura >= 280 || peso >= 400) {
    return "NaN"; // Retorna "NaN" se a Altura ou Peso for igual a zero
  }

  const alturaMetros = altura / 100; // Converte altura de centímetros para metros
  return (peso / (alturaMetros * alturaMetros)).toFixed(2); // Calcula o IMC com duas casas decimais
}

function healthCheck(imc) {
  if (imc <= 18.5) {
    return "Você está abaixo do Peso ideal. Considere procurar ajuda médica!";
  } else if (imc <= 24.9) {
    return "Você está no Peso ideal. Continue mantendo-se em forma!";
  } else if (imc <= 29.9) {
    return "Você está levemente acima do Peso ideal. Considere fazer exercícios físicos!";
  } else if (imc <= 34.9) {
    return "Você está com Obesidade grau 1. Importante tomar medidas para melhorar a saúde!";
  } else if (imc <= 39.9) {
    return "Você está com Obesidade grau 2. Favor Consultar um médico!";
  } else {
    return "Você está com Obesidade grau 3. Busque assistência médica imediatamente!.";
  }
}

function calculateWeight(altura, sexo) {
  if (altura <= 0) {
    return "NaN";
  }

  if (altura >= 280) {
    return "NaN";
  }

  // Constantes para as fórmulas de cálculo de peso ideal baseado no Sexo
  const fatorMasculino = 4.8;
  const fatorFeminino = 4.7;

  //   const alturaMetros = altura / 100; // Converte altura de centímetros para metros

  let pesoIdeal;

  // Calcule o peso ideal com base no sexo
  if (sexo === "Masculino") {
    pesoIdeal = altura - 100 - (altura - 150) / fatorMasculino;
  } else if (sexo === "Feminino") {
    pesoIdeal = altura - 100 - (altura - 150) / fatorFeminino;
  } else {
    return "Sexo não especificado";
  }

  //   console.log(pesoIdeal);

  return pesoIdeal.toFixed(2); // Arredonde o resultado para duas casas decimais
}

module.exports = { calcularIMC, healthCheck, calculateWeight }; // Exporta a função calcularIMC
