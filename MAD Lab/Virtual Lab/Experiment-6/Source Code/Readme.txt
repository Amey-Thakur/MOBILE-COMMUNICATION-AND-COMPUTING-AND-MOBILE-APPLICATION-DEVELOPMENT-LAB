================================================================================
    EXPERIMENT 6: FREQUENCY REUSE
    Fading Channels and Mobile Communication Virtual Laboratory
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Frequency Reuse (Co-channel Cells and Cell Clusters)
Experiment:     Experiment 6 - Frequency Reuse Concept
Date:           July 19, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
Repository:     https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB

Institution:    Terna Engineering College, Navi Mumbai
University:     University of Mumbai
Course:         Mobile Communication and Computing (CSC702)
Semester:       VII (Final Year, B.E. Computer Engineering)
Academic Year:  2021-2022

Source:         IIT Kharagpur Virtual Lab - Fading Channels and Mobile Communication
Virtual Lab:    http://vlabs.iitkgp.ac.in/fcmc/index.html

================================================================================
EXPERIMENT DESCRIPTION
================================================================================

AIM:
To understand the concept of Frequency Reuse, identifying Co-channel cells and
forming Cell Clusters in a cellular network.

PARTS:
This experiment consists of two parts:
1. Experiment 6A: Frequency Reuse (Co-channel Cells)
   - Objective: Identify co-channel cells in a hexagonal grid for a given
     Reuse Factor (N) and Cell Radius.
   
2. Experiment 6B: Frequency Reuse (Cell Clusters)
   - Objective: Identify the cells that form a complete cluster for a given
     Reuse Factor (N).

THEORY:
- Frequency Reuse: The practice of using the same radio frequencies on radio
  transmitter sites within a geographic area that are separated by sufficient
  distance to cause minimal interference with each other.
- Co-channel Cells: Cells that use the same set of frequencies.
- Cluster Size (N): The number of cells in a cluster. N = i^2 + ij + j^2,
  where i and j are non-negative integers. Common values: 3, 4, 7, 12, etc.

PROCEDURE:
1. Select the Cell Radius / Reuse Pattern.
2. Observe the grid of hexagonal cells.
3. Select the Co-channel cells (Part A) or Cluster cells (Part B) by clicking
   on them.
4. Correct selections will be highlighted in green.
5. Click 'Check' to validate.

================================================================================
FILE STRUCTURE
================================================================================

Experiment-6/
├── Source Code/
│   ├── Frequency_Reuse_A.html  # Part A Launcher
│   ├── Frequency_Reuse_A.jnlp  # Part A Configuration
│   ├── Frequency_Reuse_B.html  # Part B Launcher
│   ├── Frequency_Reuse_B.jnlp  # Part B Configuration
│   ├── Frequency_Reuse.jar     # Java Applet (Shared)
│   ├── deployJava.js           # Deployment Script
│   ├── README.txt              # This documentation
│   └── lib/                    # Library Dependencies

================================================================================
DISCUSSION & CONCLUSION
================================================================================

Discussion:
"As I have selected the correct cells so it is showing green colour."

Conclusion:
Hence, we have successfully performed and understood the concept of Frequency
Reuse, Co-channel cells, and Cell Clusters in Mobile communication.

================================================================================
REFERENCES
================================================================================

1. Rappaport, T. S. (2002). Wireless Communications: Principles and Practice.
2. IIT Kharagpur Virtual Lab.

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Original Experiment: IIT Kharagpur
Academic Documentation: Amey Thakur
Year: 2021

================================================================================
                         © 2021 Amey Thakur | IIT Kharagpur Virtual Lab
================================================================================