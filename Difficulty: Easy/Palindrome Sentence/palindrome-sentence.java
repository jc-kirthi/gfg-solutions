class Solution {
    public boolean isPalinSent(String s) {
        // Remove all non-alphanumeric characters and convert to uppercase
        String news = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();
        
        // Reverse the cleaned string
        String revs = new StringBuilder(news).reverse().toString();
        
        // Compare and return
        return news.equals(revs);
    }
}