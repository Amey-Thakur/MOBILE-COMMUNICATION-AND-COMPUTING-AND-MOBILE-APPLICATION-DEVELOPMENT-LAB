================================================================================
    EXPERIMENT 1: UNDERSTANDING OF PATH LOSS
    Fading Channels and Mobile Communication Virtual Laboratory
================================================================================

EXPERIMENT INFORMATION
----------------------
Title:          Understanding of Path Loss
Experiment:     Experiment 1 - Path Loss Calculation and Analysis
Date:           August 6, 2021

Author:         Amey Thakur
GitHub:         https://github.com/Amey-Thakur
ORCID:          https://orcid.org/0000-0001-5644-1575
LinkedIn:       https://www.linkedin.com/in/amey-thakur
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

This experiment provides a comprehensive understanding of Path Loss in 
wireless mobile communication systems. Path Loss represents the reduction 
in power density (attenuation) of an electromagnetic wave as it propagates 
through space from the transmitter to the receiver.

LEARNING OBJECTIVES:
--------------------
Upon completion of this experiment, students will be able to:

1. Calculate Received Power (Pr) based on transmitter parameters and distance
2. Determine Path Loss Exponent (n) for different propagation environments
3. Analyze the impact of Carrier Frequency (fc) on signal propagation
4. Evaluate Receiver Antenna Height (hRx) effects on received signal strength
5. Study Base Station (BS) Antenna Height (hTx) optimization strategies

KEY PARAMETERS:
---------------
- Transmitter Power (TxPow): Power output of the transmitting antenna (dBm)
- Path Loss Exponent (n): Environment-dependent attenuation factor (typically 2-6)
- Carrier Frequency (fc): Operating frequency of the communication system (GHz)
- Receiver Antenna Height (hRx): Height of the receiving mobile antenna (m)
- Transmitter Antenna Height (hTx): Height of the base station antenna (m)
- Reference Distance (d0): Baseline distance for path loss calculation (m)
- Distance (d): Separation between transmitter and receiver (m)

PATH LOSS MODEL:
----------------
The experiment utilizes the Log-Distance Path Loss Model:

    PL(d) = PL(d0) + 10 × n × log₁₀(d/d0) + Xσ

Where:
    PL(d)  = Path loss at distance d (dB)
    PL(d0) = Path loss at reference distance d0 (dB)
    n      = Path loss exponent
    Xσ     = Gaussian random variable representing shadow fading (dB)

TYPICAL PATH LOSS EXPONENTS:
----------------------------
Environment                         | Path Loss Exponent (n)
------------------------------------|------------------------
Free Space                          | 2.0
Urban Area (Cellular)               | 2.7 - 3.5
Shadowed Urban                      | 3.0 - 5.0
Indoor (Line of Sight)              | 1.6 - 1.8
Indoor (Obstructed)                 | 4.0 - 6.0
Factory (Obstructed)                | 2.0 - 3.0

================================================================================
FILE STRUCTURE
================================================================================

Experiment-1/
├── Source Code/
│   ├── Path_Loss.html          # HTML launcher for the Java applet
│   ├── Path_Loss.jnlp          # Java Web Start configuration file
│   ├── Path_Loss.jar           # Compiled Java applet (Path Loss simulation)
│   ├── deployJava.js           # Java deployment helper script
│   ├── README.txt              # This documentation file
│   └── lib/                    # Library dependencies
│       ├── iText-2.1.5.jar     # PDF generation library
│       ├── jcommon-1.0.16.jar  # JFreeChart common utilities
│       └── jfreechart-1.0.13.jar # Chart plotting library

================================================================================
HOW TO RUN THE EXPERIMENT
================================================================================

METHOD 1: Using HTML (Recommended)
----------------------------------
1. Ensure Java Runtime Environment (JRE) 1.5 or higher is installed
2. Double-click on "Path_Loss.html" to open in a web browser
3. Allow Java plugin to run the applet
4. Interact with the simulation parameters

METHOD 2: Using JNLP (Java Web Start)
-------------------------------------
1. Ensure Java Web Start is properly configured
2. Double-click on "Path_Loss.jnlp" file
3. Accept security prompts to launch the application
4. The simulation will open in a standalone window

SYSTEM REQUIREMENTS:
--------------------
- Operating System: Windows / Linux / macOS
- Java Runtime Environment (JRE) 1.5 or higher
- Web browser with Java plugin support (for HTML method)
- Minimum 512 MB RAM recommended

================================================================================
EXPERIMENT PROCEDURE
================================================================================

PART 1A: Calculation of Received Power
--------------------------------------
- Set initial transmitter power and distance
- Observe received power variation with distance
- Record Pr(d0) and Pr(d) values

PART 1B: Calculation of Path Loss Exponent
------------------------------------------
- Vary the environment type
- Observe changes in signal attenuation
- Calculate path loss exponent from measurements

PART 1C: Calculation of Carrier Frequency Effect
-------------------------------------------------
- Keep other parameters constant
- Vary carrier frequency (fc)
- Analyze frequency-dependent path loss

PART 1D: Calculation of Receiver Antenna Height
------------------------------------------------
- Vary receiver antenna height (hRx)
- Observe impact on received signal strength
- Optimize receiver antenna placement

PART 1E: Calculation of Base Station Antenna Height
----------------------------------------------------
- Vary transmitter/BS antenna height (hTx)
- Study coverage area variation
- Determine optimal BS antenna height

================================================================================
REFERENCES
================================================================================

1. Rappaport, T. S. (2002). Wireless Communications: Principles and Practice.
   Prentice Hall, 2nd Edition.

2. Goldsmith, A. (2005). Wireless Communications. Cambridge University Press.

3. IIT Kharagpur Virtual Lab: Fading Channels and Mobile Communication
   http://vlabs.iitkgp.ac.in/fcmc/index.html

================================================================================
LICENSE AND ATTRIBUTION
================================================================================

Original Experiment: IIT Kharagpur - Fading Channels and Mobile Communication
Virtual Lab Initiative supported by Ministry of Education, Government of India

Academic Documentation: Amey Thakur
License: Creative Commons Attribution 4.0 International (CC BY 4.0)

For academic use and educational purposes. Please cite appropriately when
using this material for research or educational documentation.

================================================================================
                         © 2021 Amey Thakur | IIT Kharagpur Virtual Lab
================================================================================