package oops.MiniProject;

public class VideoStore {
    private Video[] store = new Video[10];
    private int count = 0;

    public void addVideo(String name) {
        if (count < store.length) {
            store[count++] = new Video(name);
            System.out.println("Video \"" + name + "\" added successfully.");
        }
    }

    public void doCheckout(String name) {
        Video v = findVideo(name);
        if (v != null) {
            v.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        }
    }

    public void doReturn(String name) {
        Video v = findVideo(name);
        if (v != null) {
            v.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video v = findVideo(name);
        if (v != null) {
            v.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        }
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Video Name      |       Checkout Status |       Rating");
        for (int i = 0; i < count; i++) {
            Video v = store[i];
            System.out.println(v.getName() + "          |       " + v.getCheckout() + "            |       " + v.getRating());
        }
        System.out.println("--------------------------------------------------------");
    }

    private Video findVideo(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) return store[i];
        }
        return null;
    }
}
