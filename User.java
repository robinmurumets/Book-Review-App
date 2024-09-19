import java.util.List;

public class User {
    private String Username;
    private int Followers;
    private int Following;
    private List<String> Reviews;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getFollowers() {
        return Followers;
    }

    public void setFollowers(int followers) {
        Followers = followers;
    }

    public int getFollowing() {
        return Following;
    }

    public void setFollowing(int following) {
        Following = following;
    }

    public List<String> getReviews() {
        return Reviews;
    }

    public void setReviews(List<String> reviews) {
        Reviews = reviews;
    }

    public void addFollower() {
        this.Followers++;
    }
    public void addFollowing() {
        this.Following++;
    }
}
