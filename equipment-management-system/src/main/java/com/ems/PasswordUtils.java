package com.ems;

import org.mindrot.jbcrypt.BCrypt;

/**
 * 
 * A UTILITY CLASS FOR HANDLING PASSWORD HASHING AND VERIFICATION
 * THIS CLASS USES THE BCrypt ALGORITHM TO SECURELY HASH AND CHECK PASSWORD
 * 
 */

public class PasswordUtils {
    
    /**
     * HASHES A PASSWORD USING THE BCrypt ALGORITHM
     * 
     * @param plainPassword THE PLAIN-TEXT PASSWORD TO HASH
     * @return THE HASHED PASSWORD
     * 
     */

     public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
     }

     /**
      * CHECKS IF A PLAIN-TEXT PASSWORD MATCHES A HASHED PASSWORD
      *
      * @param plainPassword THE PLAIN-TEXT PASSWORD TO HASH
      * @param hashedPassword THE HASHED PASSWORD FROM THE DATABASE
      * @return true IF THE PASSWORD MATCHES, false OTHERWISE
      */

      public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
      }
}
