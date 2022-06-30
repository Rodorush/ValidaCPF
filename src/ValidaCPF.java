public class ValidaCPF {
    private boolean resultado;

    public ValidaCPF(String cpf) {
        cpf = cpf.replaceAll("\\D+", "");
        int CPF_SIZE = 11;
        boolean isValid = cpf.length() == CPF_SIZE;

        if (isValid) {
            int[] cpf1 = new int[CPF_SIZE];
            for (int i = 0; i < CPF_SIZE; i++) cpf1[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            int soma = cpf1[0] * 10 + cpf1[1] * 9 + cpf1[2] * 8 + cpf1[3] * 7 + cpf1[4] * 6 + cpf1[5] * 5 + cpf1[6] * 4 +
                    cpf1[7] * 3 + cpf1[8] * 2;
            int resto = soma % CPF_SIZE;
            int digito1 = (resto == 0 || resto == 1) ? 0 : CPF_SIZE - resto;
            soma = cpf1[0]*11+ cpf1[1]*10+ cpf1[2]*9+ cpf1[3]*8+ cpf1[4]*7+ cpf1[5]*6+ cpf1[6]*5+
                    cpf1[7]*4+ cpf1[8]*3+ digito1 *2;
            resto = soma % CPF_SIZE;
            int digito2 = (resto == 0 || resto == 1) ? 0 : CPF_SIZE - resto;
            resultado = cpf1[9] == digito1 && cpf1[10] == digito2;
        }
    }

    public String resultado() {
        return "CPF"+(resultado ? " válido!" : " inválido!");
    }
}