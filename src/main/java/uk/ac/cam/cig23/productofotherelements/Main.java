/*
 * Copyright 2019 Ben Philps <bp413@cam.ac.uk>, Andrew Rice <acr31@cam.ac.uk>, C.I. Griffiths
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.cig23.productofotherelements;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] testArr = new int[] {1, 2, 3, 4, 5};
    int[] result = findArrayProducts(testArr);
    System.out.println(Arrays.toString(result));
  }

  static int[] findArrayProducts(int[] arr) {
    int[] results = new int[arr.length];
    for (int i = 0; i < results.length; i++) {
      int total = 1;
      for (int j = 0; j < arr.length; j++) {
        if (j != i) {
          total = total * arr[j];
        }
      }
      results[i] = total;
    }
    return results;

  }

    static double[] findArrayProducts(double[] arr) {
        double[] results = new double[arr.length];
        for (int i = 0; i < results.length; i++) {
            double total = 1.0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    total = total * arr[j];
                }
            }
            results[i] = total;
        }
        return results;

    }
}