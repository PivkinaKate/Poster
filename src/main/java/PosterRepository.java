public class PosterRepository {
    private Poster[] afishes = new Poster[0];


    public void save(Poster afisha) {
        Poster[] tmp = new Poster[afishes.length + 1];
        for (int i = 0; i < afishes.length; i++) {
            tmp[i] = afishes[i];
        }
        tmp[tmp.length - 1] = afisha;
        afishes = tmp;
    }

    public Poster [] getAfishes() {
        return afishes;
    }


}
