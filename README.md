

## Aulas 64 a 66 - Associação unidirecional

### 1. Exemplo um para muitos:

~~~
public class Player {
    private String name;
    private String position;
    private int age;

    /* Muitos jogadores têm apenas um clube */
    private Team team;
    
    ...
    
}
~~~

#### Os jogadores podem compartilhar do mesmo clube/time, mas só poderão ter apenas um. Ao contrário de um clube, que pode ter muitos jogadores associados a ele.

### 2. Exemplo muitos para um:

~~~
public class School {
    private String name;
    private String director;
    private Student[] students;

    ...
    
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
    
}
~~~

#### Uma escola pode ter múltiplos alunos associados a ela, mas um estudante só pode estar matriculado numa escola.

---
## Aulas 95 a 104 - Destrinchando exceções

![img.png](src/assets/images/img.png)

### Error x Exception:

- A maioria dos casos de erros não são causados pelo nosso programa estes são devido à falta de recursos do sistema e estes não são recuperáveis.
- A maioria dos casos de exceções são causadas pelo nosso programa e estes são recuperáveis.

### Tipos de exceções:

#### Checked:

- São lançadas em tempo de compilação e herdam da Classe Exception.

#### Unchecked:

- São lançadas em tempo de execução e herdam da Classe RuntimeException.

![img_1.png](src/assets/images/img_1.png)

### Variações ao implementar exceções:

#### Try-with-resources:

- A fim de evitar o uso do bloco finally{}, usa-se a seguinte estrutura:

~~~
try (Scanner input = new Scanner(System.in);
     BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
     
     ...

    } catch (Exception e) {
        e.printStackTrace();  
    }       
~~~

#### Essa estrutura abstrai a execução dos métodos input.close() e br.close(). Muito por conta disso, tem-se a seguinte regra de uso:

- Pode-se passar como recurso, somente objetos de classes que implementem Closeable ou AutoCloseable. Pois o objetivo desta implementação é sempre fechar algo, pode ser uma conexão com um banco, um arquivo, etc.
- Como a classe Scanner: public final class Scanner implements Iterator<String>, Closeable {...}

#### Múltiplos catches e catch em linha:

- Multi-catch:
~~~
try {
    ...
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (Exception e) {
       e.printStackTrace();
    } 
~~~

#### A ordem das exceções deve ser das mais específicas para as generalistas.

- catch in line:
~~~
try {
    ...
    } catch (InvalidLoginException | InputMismatchException e) {
        if (e instanceof InputMismatchException) {
            System.out.println("A senha informada contém caracteres diferentes do permitido.");
            } else {
                e.printStackTrace();
            }
    }
~~~

#### Não se pode agrupar exceções da mesma hierarquia de herança. 

- Isso ocorre porque, no bloco catch (A | B e), o compilador trata e como efetivamente final, ou seja, você não pode reatribuir ou fazer downcast direto com segurança.
- Ao usar InputMismatchException e NoSuchElementException em linha, o programa retornará erro na primeira exceção, uma vez que ela é filha da segunda.

---
## Aulas 106 e 107 - Wrappers

#### As classes especiais Wrappers, dão mais poder às variáveis primitivas. Transformando-as em um Objeto com diversos métodos úteis.

- Boxing ou autoboxing e unboxing:

~~~
Character character = '1'; // autoboxing

boolean bool = Character.isLetter(character);

char ch = character; // unboxing

System.out.println(bool + " | " + ch); // Saída esperada: false | 1
~~~

#### Boxing consiste em "embrulhar" uma variável primitiva em um objeto Wrapper, o que inspira seu nome.

---
## Aulas 108 a 111 - String vs StringBuilder vs StringBuffer

#### Entendendo as diferenças entre as três abordagens para manipulação de texto:

- **String**: Imutável. Toda modificação gera um novo objeto na memória.
- **StringBuilder**: Mutável e mais performática, indicada para uso em ambientes de thread única.
- **StringBuffer**: Mutável e segura para múltiplas threads, mas menos performática que o StringBuilder por conta da sincronização.

~~~
String nome = "Ana";
nome += " Silva"; // Cria um novo objeto: "Ana Silva"
~~~

#### Nesse exemplo, temos três objetos String:
- `"Ana"` (literal)
- `" Silva"` (literal)
- `"Ana Silva"` (objeto novo criado na concatenação)


### String Pool (intern pool)

#### O String Pool é uma área de memória especial usada para armazenar strings literais reutilizáveis. Exemplo:

~~~
String a = "Teste";
String b = "Teste";
System.out.println(a == b); // true, ambos apontam para o mesmo objeto no pool

String c = new String("Teste");
System.out.println(a == c); // false, c é um novo objeto no heap

String d = new String("Teste").intern();
System.out.println(a == d); // true, d foi movido para o pool
~~~

- Strings criadas com `new` não são automaticamente adicionadas ao pool.
- O método `intern()` adiciona a string ao pool, se ainda não estiver lá.

#### O uso do pool melhora a eficiência de memória e evita duplicação desnecessária de dados imutáveis.

---
## Aulas 131 a 136 - Regex

### Diferença entre matches() e find():

- **matches()**: tenta casar o texto inteiro com o padrão.
- **find()**: procura ocorrências válidas num texto maior, mesmo que ele não obedeça 100% ao padrão.

[Ver exemplo PatternMatcherTest.java](src/devdojo/regex/test/PatternMatcherTest.java)