// Interfaces para os produtos distintos
interface Cadeira {
    String getEstilo();
}

interface Sofa {
    String getEstilo();
}

interface MesaDeCentro {
    String getEstilo();
}

// Variantes de produtos para estilo Moderno
class CadeiraModerna implements Cadeira {
    @Override
    public String getEstilo() {
        return "Cadeira no estilo Moderno";
    }
}

class SofaModerno implements Sofa {
    @Override
    public String getEstilo() {
        return "Sofá no estilo Moderno";
    }
}

class MesaDeCentroModerna implements MesaDeCentro {
    @Override
    public String getEstilo() {
        return "Mesa de Centro no estilo Moderno";
    }
}

// Variantes de produtos para estilo Vitoriano
class CadeiraVitoriana implements Cadeira {
    @Override
    public String getEstilo() {
        return "Cadeira no estilo Vitoriano";
    }
}

class SofaVitoriano implements Sofa {
    @Override
    public String getEstilo() {
        return "Sofá no estilo Vitoriano";
    }
}

class MesaDeCentroVitoriana implements MesaDeCentro {
    @Override
    public String getEstilo() {
        return "Mesa de Centro no estilo Vitoriano";
    }
}

// Fábrica abstrata para criar famílias de móveis
interface FabricaMoveis {
    Cadeira criarCadeira();
    Sofa criarSofa();
    MesaDeCentro criarMesaDeCentro();
}

// Fábrica concreta para estilo Moderno
class FabricaMoveisModerno implements FabricaMoveis {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaModerno();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroModerna();
    }
}

// Fábrica concreta para estilo Vitoriano
class FabricaMoveisVitoriano implements FabricaMoveis {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVitoriana();
    }

    @Override
    public Sofa criarSofa() {
        return new SofaVitoriano();
    }

    @Override
    public MesaDeCentro criarMesaDeCentro() {
        return new MesaDeCentroVitoriana();
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando móveis no estilo Moderno
        FabricaMoveis fabricaModerna = new FabricaMoveisModerno();

        Cadeira cadeiraModerna = fabricaModerna.criarCadeira();
        Sofa sofaModerno = fabricaModerna.criarSofa();
        MesaDeCentro mesaModerna = fabricaModerna.criarMesaDeCentro();

        System.out.println("Móveis no estilo Moderno:");
        System.out.println(cadeiraModerna.getEstilo());
        System.out.println(sofaModerno.getEstilo());
        System.out.println(mesaModerna.getEstilo());
        System.out.println();

        // Criando móveis no estilo Vitoriano
        FabricaMoveis fabricaVitoriana = new FabricaMoveisVitoriano();

        Cadeira cadeiraVitoriana = fabricaVitoriana.criarCadeira();
        Sofa sofaVitoriano = fabricaVitoriana.criarSofa();
        MesaDeCentro mesaVitoriana = fabricaVitoriana.criarMesaDeCentro();

        System.out.println("Móveis no estilo Vitoriano:");
        System.out.println(cadeiraVitoriana.getEstilo());
        System.out.println(sofaVitoriano.getEstilo());
        System.out.println(mesaVitoriana.getEstilo());
    }
}