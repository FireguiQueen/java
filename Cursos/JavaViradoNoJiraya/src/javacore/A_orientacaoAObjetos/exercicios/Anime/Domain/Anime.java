package javacore.A_orientacaoAObjetos.exercicios.Anime.Domain;

public class Anime
{
    private String name;
    private String category;
    private String studio;
    private String description;

    private int yearOfRelease;
    private String[][] seasonsAndEpisodios;

    private int totalSeasons;


    public Anime(String name, String category, String studio, String description, int yearOfRelease, String[][] seasonsAndEpisodios)
    {
        this.name = name;
        this.category = category;
        this.studio = studio;
        this.description = description;
        this.yearOfRelease = yearOfRelease;
        this.seasonsAndEpisodios = seasonsAndEpisodios;

        totalSeasons = this.seasonsAndEpisodios.length;
    }

    public void getMainInformation()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Seasons: " + totalSeasons);
        System.out.print("Episodios: ");
        for (int i = 0; i < totalSeasons; i++)
        {
            System.out.print("\nS" + (i+1) + ": ");
            for (int j = 0; j < seasonsAndEpisodios[i].length; j++)
            {
                System.out.print(seasonsAndEpisodios[i][j]);
                System.out.print(seasonsAndEpisodios[i][j] == seasonsAndEpisodios[i][seasonsAndEpisodios[i].length - 1]? "" : " | ");
            }
        }
    }

    public void getAllInformation()
    {
        getMainInformation();
        System.out.println("\nCategory: " + category);
        System.out.println("Studio: " + studio);
        System.out.println("Year of release: " + yearOfRelease);
        System.out.println("Description: " + description);
    }

}
