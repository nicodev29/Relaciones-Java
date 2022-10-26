package Extra2.Entidades;

public enum Peliculas {
    SINFONICO("Cerati Sinfonico", 4, "Gustavo Cerati", 6),
    HANIBBAL("Hannibal Lecter", 2, "Unkwnon", 13),
    ARG1985("Argentina 1985", 2, "Santiago Mitre", 13),
    INHOLLYWOOD("Once upon a time in Hollywood", 3, "Tarantino", 6),
    FIGHTCLUB("Fight Club", 2.5, "Brad Pitt", 13),
    SILICONVALEY("Silicon Valey", 10, "Microsoft", 6),
    WALLSTREET("Wolf of Wall Street", 3, "Di Caprio", 13),
    INTERESTELLAR("Interestellar", 3.5, "Nolan", 6);

    private final String titulo;
    private final Double duracion;
    private final String director;
    private final int edad_minima;

    private Peliculas(String titulo, Double duracion, String director, int edad_minima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edad_minima = edad_minima;
    }
    private Peliculas(String titulo, int duracion, String director, int edad_minima) {
        this.titulo = titulo;
        this.duracion = (double) duracion;
        this.director = director;
        this.edad_minima = edad_minima;
    }

    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", director='" + director + '\'' +
                ", edad_minima=" + edad_minima +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }
    public int getEdadMinima() {
        return edad_minima;
    }
}
