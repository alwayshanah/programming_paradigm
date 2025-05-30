import java.util.*;

class HuffmanNode {
   char character;
   int frequency;
   HuffmanNode left, right;

   HuffmanNode(char character, int frequency) {
      this.character = character;
      this.frequency = frequency;
      this.left = null;
      this.right = null;
   }
}

class HuffmanComparator implements Comparator<HuffmanNode> {
   public int compare(HuffmanNode o1, HuffmanNode o2) {
      return o1.frequency - o2.frequency;
   }
}

public class HuffmanEncoding {

   private static void generateCodes(HuffmanNode root, String code, Map<Character, String> codes) {
      if (root == null) 
         return;
   
      if (root.left == null && root.right == null) {
         codes.put(root.character, code);
         return;
      }
   
      generateCodes(root.left, code + "0", codes);
      generateCodes(root.right, code + "1", codes);
   }

   private static String encode(String message, Map<Character, String> codes) {
      StringBuilder encodedMessage = new StringBuilder();
      for (char c : message.toCharArray()) {
         encodedMessage.append(codes.get(c));
      }
      return encodedMessage.toString();
   }

   private static String decode(String encodedMessage, HuffmanNode root) {
      StringBuilder decodedMessage = new StringBuilder();
      HuffmanNode current = root;
      for (char bit : encodedMessage.toCharArray()) {
         current = (bit == '0') ? current.left : current.right;
         if (current.left == null && current.right == null) {
            decodedMessage.append(current.character);
            current = root;
         }
      }
      return decodedMessage.toString();
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String choice;
   
      do {
         System.out.print("Enter message: ");
         String message = scanner.nextLine();
      
         Map<Character, Integer> freqMap = new HashMap<>();
         for (char c : message.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
         }
      
         PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>(new HuffmanComparator());
         for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            priorityQueue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
         }
      
         while (priorityQueue.size() > 1) {
            HuffmanNode left = priorityQueue.poll();
            HuffmanNode right = priorityQueue.poll();
            HuffmanNode merged = new HuffmanNode('\0', left.frequency + right.frequency);
            merged.left = left;
            merged.right = right;
            priorityQueue.add(merged);
         }
      
         HuffmanNode root = priorityQueue.poll();
      
         Map<Character, String> codes = new HashMap<>();
         generateCodes(root, "", codes);
      
         String encodedMessage = encode(message, codes);
         String decodedMessage = decode(encodedMessage, root);
      
         int asciiBits = message.length() * 8;
         int huffmanBits = encodedMessage.length();
      
         System.out.println("\nCoded message in bits:");
         System.out.println(encodedMessage);
      
         System.out.println("\nDecoded message:");
         System.out.println(decodedMessage);
      
         System.out.println("\nNumber of bits of the message in ASCII:");
         System.out.println(asciiBits);
      
         System.out.println("\nNumber of bits of the message using Huffman Tree:");
         System.out.println(huffmanBits);
      
         System.out.print("\nEnter another message? (y/n): ");
         choice = scanner.nextLine().trim().toLowerCase();
         
      } while (choice.equals("y"));
   
      scanner.close();
   }
}
