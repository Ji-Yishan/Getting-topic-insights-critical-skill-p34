package org.p34.critical.pojo;

/**
 * @author: Isabella
 * @create: 2023-06-01 20:28
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
