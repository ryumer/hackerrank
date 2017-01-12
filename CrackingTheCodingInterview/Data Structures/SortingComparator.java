// Write your Checker class here

class Checker implements Comparator<Player>{
    public int compare(Player p1, Player p2) {
        if (p1.score > p2.score) return -1;
        if (p1.score < p2.score) return 1;
        return p1.name.compareTo(p2.name);
    }
}