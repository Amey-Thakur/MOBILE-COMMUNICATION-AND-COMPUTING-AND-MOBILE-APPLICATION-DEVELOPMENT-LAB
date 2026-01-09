================================================================================
    EXPERIMENT 4: HANDOVER MECHANISM
    Fading Channels and Mobile Communication Virtual Laboratory
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Understanding the Handover Mechanism
Experiment:     Experiment 4 - Handover (Handoff) in Mobile Communication
Date:           August 13, 2021

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
To understand the handover mechanism (also known as handoff) in cellular networks.

INTRODUCTION:
Handover (or handoff) is the process of transferring an ongoing call or data
session from one channel connected to the core network to another channel.
This is essential in cellular telecommunications to ensure connectivity for
users moving between different cells.

KEY PARAMETERS:
- Reuse Model: Rune (Pattern 4)
- Frequency (fc): 0.9 GHz
- Beam Width: 70 degrees
- Cell Radius: 50 m
- Height of Transmitter (hT): 10 m
- Height of Mobile (hM): 1 m
- Sigma: 4 dB
- SNR Threshold: 5 dB

PROCEDURE:
1. Initialize the simulation with input parameters.
2. Observe the movement of the mobile station (MS) between cells.
3. Monitor the Signal-to-Noise Ratio (SNR) and Interference levels.
4. Observe when a handover is triggered relative to the thresholds.
5. Record the number of Call Drops and Handoffs.

================================================================================
FILE STRUCTURE
================================================================================

Experiment-4/
├── Source Code/
│   ├── Handover_Mechanism.html # HTML launcher for the experiment
│   ├── Handover_Mechanism.jnlp # Java Web Start configuration
│   ├── Handover_Mechanism.jar  # Java applet (Handover simulation)
│   ├── deployJava.js           # Java deployment helper script
│   ├── README.txt              # This documentation file
│   └── lib/                    # Library dependencies
│       └── iText-2.1.5.jar

================================================================================
QUIZ & DISCUSSION
================================================================================

Q1. Differentiate between Hard and Soft Handover.

    SOFT HANDOVER:
    - The handover in which radio links are added and removed in a way that
      the Mobile Station (MS) always keeps at least one radio link to the
      network (UTRAN).
    - Known as "Make before break".
    - Lower call drop rate.
    
    HARD HANDOVER:
    - The handover in which all the old radio links in MS are removed before
      the new radio links are established.
    - Known as "Break before make".
    - Higher rates of call drops are found.

Q2. Handoff threshold depends on type of service (e.g. Voice, Video, Data)?
    Ans: Yes. Different services have different latency and packet loss
    requirements, influencing the handover threshold.

================================================================================
REFERENCES
================================================================================

1. Rappaport, T. S. (2002). Wireless Communications: Principles and Practice.
   Prentice Hall.
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