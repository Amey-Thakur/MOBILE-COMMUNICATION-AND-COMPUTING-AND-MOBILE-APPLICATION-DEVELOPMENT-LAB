================================================================================
    EXPERIMENT 3: FREQUENCY REUSE
    Fading Channels and Mobile Communication Virtual Laboratory
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Understanding Cellular Network Frequency Reuse
Experiment:     Experiment 3 - Frequency Reuse Concept
Date:           July 19, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
Repository:     https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB

Institution:    Terna Engineering College, Navi Mumbai
University:     University of Mumbai
Course:         Mobile Communication and Computing (CSC702) & Mobile Application Development Lab (CSL702)
Semester:       VII (Final Year, B.E. Computer Engineering)
Academic Year:  2021-2022

Source:         IIT Kharagpur Virtual Lab - Fading Channels and Mobile Communication
Virtual Lab:    http://vlabs.iitkgp.ac.in/fcmc/index.html

================================================================================
EXPERIMENT DESCRIPTION
================================================================================

AIM:
To understand the cellular network frequency reuse concept fulfilling the
following objectives:
1. Finding the co-channel cells for a particular cell.
2. Finding the cell clusters within a certain geographic area.

THEORY:
In the cellular system, the service area is divided into cells. A transmitter
is designed to serve an individual cell. The system seeks to make efficient
use of available channels by using low-power transmitters to allow frequency
reuse at much smaller distances. Maximizing the number of times each channel
can be reused in a given geographic area is the key to an efficient cellular
system design.

Two cells having the same number in the adjacent cluster use the same set of
RF channels and hence are termed as "Co-channel cells".

Cluster Size (N):
The N cells which collectively use the complete set of available frequencies
are called a cluster. If the cluster is duplicated M times within the system,
the total number of duplex channels C can be used as a measure of capacity:
    C = M × K × N = M × S

Where:
    S = Total number of duplex channels available for use
    K = Number of channels per cell
    N = Cluster size (typically equal to 3, 4, 7, 9, 12...)

Geometry of Hexagons:
The number of cells per Cluster, N, can only have values which satisfy the
equation:
    N = i² + i×j + j²
    
Where i and j are non-negative integers.
Possible values of N: 3, 4, 7, 9, 12, 13, 19...

Locating Co-channel Neighbors:
To find the nearest co-channel neighbor of a particular cell:
1. Move 'i' cells along any chain of hexagons.
2. Turn 60 degrees counter-clockwise.
3. Move 'j' cells.

================================================================================
FILE STRUCTURE
================================================================================

Experiment-3/
├── Source Code/
│   ├── Frequency_Reuse.html    # HTML launcher for the experiment
│   ├── Frequency_Reuse.jnlp    # Java Web Start configuration
│   ├── Frequency_Reuse.jar     # Java applet (Frequency Reuse simulation)
│   ├── deployJava.js           # Java deployment helper script
│   ├── README.txt              # This documentation file
│   └── lib/                    # Library dependencies
│       ├── iText-2.1.5.jar
│       ├── jcommon-1.0.16.jar
│       └── jfreechart-1.0.13.jar

================================================================================
QUIZ & DISCUSSION
================================================================================

Q1. With an example, explain Co-channel cells.
    Ans: Two cells having the same number in the adjacent cluster use the same
    set of RF channels and hence are termed as "Co-channel cells".
    Consider a cellular system with S duplex channels available, let each cell
    be allocated a group of k channels (k < S), and if the S channels are
    divided among N cells. Available radio channels can be expressed as:
    S = K × N

Q2. Explain the working of a cellular system.
    Ans: In the cellular system, the service area is divided into cells. A
    transmitter is designed to serve an individual cell. The system seeks to
    make efficient use of available channels by using low-power transmitters
    to allow frequency reuse at much smaller distances.

================================================================================
REFERENCES
================================================================================

1. Rappaport, T. S. (2002). Wireless Communications: Principles and Practice.
   Prentice Hall, 2nd Edition.
2. IIT Kharagpur Virtual Lab: Fading Channels and Mobile Communication.

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Original Experiment: IIT Kharagpur
Academic Documentation: Amey Thakur
Year: 2021

================================================================================
                         © 2021 Amey Thakur | IIT Kharagpur Virtual Lab
================================================================================