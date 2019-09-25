package blogpost;

public class Main {

  public static void main(String[] args) {

    BlogPost firstPost = new BlogPost("John Doe", "Lorem Ipsum", "2000.05.04.");
    firstPost.text = "Lorem ipsum dolor sit amet.";

    BlogPost secondPost = new BlogPost("Tim Urban", "Wait but why", "2010.10.10");
    secondPost.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost thirdPost = new BlogPost("William Turton",
        "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28");
    thirdPost.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

  }
}
