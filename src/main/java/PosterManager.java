public class PosterManager {

    private PosterRepository repo;

    public PosterManager(PosterRepository repo) {
        this.repo = repo;
    }

    public void add(Poster afisha) {
        repo.save(afisha);
    }


    public Poster[] getAfishes() {
        Poster[] all = repo.getAfishes();
        Poster[] reversed = new Poster[all.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}
