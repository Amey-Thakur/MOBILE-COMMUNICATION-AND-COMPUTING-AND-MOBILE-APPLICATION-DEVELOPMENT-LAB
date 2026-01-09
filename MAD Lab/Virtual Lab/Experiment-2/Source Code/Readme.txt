================================================================================
    EXPERIMENT 2: CO-CHANNEL INTERFERENCE AND SINR
    Fading Channels and Mobile Communication Virtual Laboratory
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Understanding Co-channel Interference and SINR
Experiment:     Experiment 2 - Co-channel Interference and Signal-to-Interference-plus-Noise Ratio
Date:           July 29, 2021

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
To understand the concept of Co-channel Interference (CCI) and Signal-to-
Interference-plus-Noise Ratio (SINR).

INTRODUCTION:
Co-channel interference, or CCI, is crosstalk from two different radio transmitters
using the same frequency channel. CCI can be caused by many factors, from weather
conditions to administrative and design issues. It is a fundamental limitation in
cellular networks where frequencies are reused to increase capacity.

Co-channel interference may be controlled by various radio resource management
schemes.

KEY CONCEPTS:
1. SINR (Downlink): Signal received by the mobile station from the base station
   relative to interference and noise.
2. SINR (Uplink): Signal received by the base station from the mobile station
   relative to interference and noise.
3. Frequency Reuse: The practice of using the same frequency channels in different
   cells to increase network capacity.

================================================================================
FILE STRUCTURE
================================================================================

Experiment-2/
├── Source Code/
│   ├── Co_Channel_Interference.html  # HTML launcher for the experiment
│   ├── Co_Channel_Interference.jnlp  # Java Web Start configuration
│   ├── Co_Channel_Interference.jar   # Java applet (Experiment simulation)
│   ├── deployJava.js                 # Java deployment helper script
│   ├── README.txt                    # This documentation file
│   └── lib/                          # Library dependencies
│       ├── iText-2.1.5.jar
│       ├── jcommon-1.0.16.jar
│       └── jfreechart-1.0.13.jar

================================================================================
EXPERIMENT PROCEDURE
================================================================================

PART A: SINR (Downlink) Calculation
-----------------------------------
1. Launch the simulation.
2. Observe the "SINR vs Distance" graph for Downlink.
3. Analyze the relationship between distance from the Base Station and SINR.
4. Note that as distance increases, SINR typically decreases due to path loss
   and increased interference relative to the signal.

PART B: SINR (Uplink) Calculation
---------------------------------
1. Switch to the Uplink mode (if available).
2. Observe the "SINR vs Distance" graph for Uplink.
3. Compare the Uplink and Downlink SINR characteristics.

INPUT AND OUTPUT PARAMETERS:
----------------------------
- Pr (dBm): Received Power
- d (m): Distance measurements
- SINR (dB): Calculated Signal-to-Interference-plus-Noise Ratio

================================================================================
QUIZ & ASSESSMENT
================================================================================

Q1. For downlink: if Pr_z1 = -88.56 dBm, Pr_z2 = -83.45 dBm, Pn1 = -100.01 dBm,
    find SINR for MS.
    [Formula: SINR = Signal / (Interference + Noise)]

Q2. What is uplink and what is downlink in mobile communication?
    Ans: Uplink and downlink refer to the two-way communication between a cell
    tower and a user phone.
    - Downlink: Signal coming from a cell tower to your cellular device.
    - Uplink: Signal leaving your cellular device and going back to the cell tower.

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