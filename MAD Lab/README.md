<!-- =========================================================================================
                                     HEADER SECTION
     ========================================================================================= -->
<div align="center">

  # Mobile Application Development Lab

  ### CSL702 · Semester VII · Computer Engineering

  [![Curated by](https://img.shields.io/badge/Curated%20by-Amey%20Thakur-blue.svg)](https://github.com/Amey-Thakur)
  [![Documents](https://img.shields.io/badge/Documents-10-yellowgreen.svg)](#experiment-1-understanding-of-path-loss)
  [![Language](https://img.shields.io/badge/Language-Java%20%7C%20XML-orange.svg)](./)
  [![Type](https://img.shields.io/badge/Type-PDF%20%7C%20DOCX-blueviolet.svg)](./)

  **A comprehensive collection of laboratory experiments for Mobile Application Development, covering Android UI design, activities, intents, fragments, services, databases, and mobile application architecture.**

  ---

  [How to Use](#how-to-use) &nbsp;·&nbsp; [Learning Path](#learning-path) &nbsp;·&nbsp; [Experiment 1](#experiment-1-understanding-of-path-loss) &nbsp;·&nbsp; [Experiment 2](#experiment-2-understanding-co-channel-interference-and-sinr) &nbsp;·&nbsp; [Experiment 3](#experiment-3-understanding-cellular-network-frequency-reuse) &nbsp;·&nbsp; [Experiment 4](#experiment-4-understanding-the-handover-mechanism) &nbsp;·&nbsp; [Experiment 5](#experiment-5-wml-form-validation-for-wap-enabled-phones) &nbsp;·&nbsp; [Experiment 6](#experiment-6-wml-calculator-and-calendar-for-android-phones) &nbsp;·&nbsp; [Experiment 7](#experiment-7-analyzing-network-packets-using-wireshark) &nbsp;·&nbsp; [Experiment 8](#experiment-8-ubuntu-installation-and-wireless-network-manet-using-ns2) &nbsp;·&nbsp; [Experiment 9](#experiment-9-android-user-form-with-validation) &nbsp;·&nbsp; [Experiment 10](#experiment-10-setup-and-configuration-of-wireless-access-points)

</div>

---

> [!TIP]
> **Android Studio Setup**: When setting up Android Studio, ensure you have the latest SDK installed. Use AVD Manager to create an emulator matching your target API level. For debugging, enable USB debugging on your physical device or use Android Studio's built-in profiler to monitor app performance.

> [!WARNING]
> **API Level Compatibility**: Android applications must handle different API levels correctly. Always check minimum SDK requirements and use AppCompat libraries for backward compatibility. Pay special attention to Activity lifecycle methods and handle configuration changes (like screen rotation) properly to prevent data loss.

---

<!-- =========================================================================================
                                     HOW TO USE SECTION
     ========================================================================================= -->
## How to Use

### Running Android Projects
1. **Open Android Studio** and select "Open an existing project".
2. **Navigate** to the experiment folder containing the Android project.
3. **Sync Gradle** files when prompted.
4. **Run** the application by clicking the green play button or pressing `Shift+F10`.

**Example:**
```bash
# Open Android Studio from command line (Windows)
cd "MAD Lab/Experiment-1"
start studio64.exe .
```

> [!TIP]
> **Virtual Lab**: Access the source code and simulations for all experiments in the [**Virtual Lab Section**](#virtual-lab-simulations). Mobile Application Development experiments can also be accessed through the [**IIT Kharagpur Virtual Lab**](http://vlabs.iitkgp.ac.in/fcmc/index.html).

### Laboratory Reports
Each experiment includes comprehensive PDF reports covering:
- **Aim**: The specific mobile app development objective
- **Theory**: Android components, lifecycle, and architecture concepts
- **Implementation**: Code explanation with screenshots of UI and execution
- Use these reports as a reference for structuring your own lab submissions.

---

<!-- =========================================================================================
                                     LEARNING PATH SECTION
     ========================================================================================= -->
## Learning Path

### Phase 1: Concepts of Mobile Communication
Understanding foundational concepts of wireless networks.
- **Experiment 1**: Path Loss.
- **Experiment 2**: Co-channel Interference & SINR.
- **Experiment 3**: Frequency Reuse.
- **Experiment 4**: Handover Mechanisms.

### Phase 2: Mobile Application Development (WAP/WML)
Legacy mobile web development.
- **Experiment 5**: WML Form Validation.
- **Experiment 6**: WML Calculator & Calendar.

### Phase 3: Network Simulation & Analysis
Hands-on with network tools.
- **Experiment 7**: Packet Analysis with Wireshark.
- **Experiment 8**: MANET Simulation with NS2.
- **Experiment 10**: Wireless Access Point Configuration.

### Phase 4: Android Development
Modern mobile app development.
- **Experiment 9**: Android User Form with Validation.

---

<!-- =========================================================================================
                                     VIRTUAL LAB SECTION
     ========================================================================================= -->
## Virtual Lab Simulations

This repository includes the underlying **Source Code and Simulations** for the experiments, allowing you to run them locally.

### Technologies Used

| Technology | Type | Experiments |
| :--- | :--- | :--- |
| **Java Applets** | Legacy Simulation | Exp 1, 2, 3, 4, 6, 8, 10 |
| **NS2 (TCL)** | Network Simulator | Exp 8 |
| **Wireshark** | Packet Analysis | Exp 7 |
| **Android** | Mobile App | Exp 9 |
| **Cisco Packet Tracer** | Network Config | Exp 10 |

### How to Run

1.  **Legacy Java Applets**: Use `appletviewer <filename>.html` (from JDK) in the `Source Code` directory.
2.  **NS2 Simulation**: Use `ns <filename>.tcl` (requires NS2 installed).
3.  **Android Projects**: Open the project folder in **Android Studio**.

> [!TIP]
> **Access Source Code**: Use the **"Virtual Code"** links in the experiment tables below to navigate directly to the simulation files.

---

<!-- =========================================================================================
                                     EXPERIMENT 1
     ========================================================================================= -->
## Experiment 1: Understanding of Path Loss

Understanding the path loss prediction formula

**Date:** August 06, 2021

| # | Document | Description | Link | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-1/AMEY_B-50_MCC_EXPERIMENT-1.pdf) | [View Code](Virtual%20Lab/Experiment-1/Source%20Code/) |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-1/AMEY_B-50_MCC_EXPERIMENT-1.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 2
     ========================================================================================= -->
## Experiment 2: Understanding Co-channel Interference and SINR

Understanding the concept of co-channel interference and SINR (Signal to Interference plus Noise Ratio)

**Date:** July 29, 2021

| # | Document | Description | Link | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-2/AMEY_B-50_MCC_EXPERIMENT-2.pdf) | [View Code](Virtual%20Lab/Experiment-2/Source%20Code/) |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-2/AMEY_B-50_MCC_EXPERIMENT-2.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 3
     ========================================================================================= -->
## Experiment 3: Understanding Cellular Network Frequency Reuse

Understanding the cellular network frequency reuse concept - finding co-channel cells and cell clusters

**Date:** July 19, 2021

| # | Document | Description | Link | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-3/AMEY_B-50_MCC_EXPERIMENT-3.pdf) | [View Code](Virtual%20Lab/Experiment-3/Source%20Code/) |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-3/AMEY_B-50_MCC_EXPERIMENT-3.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 4
     ========================================================================================= -->
## Experiment 4: Understanding the Handover Mechanism

Understanding the handover mechanism in mobile communication

**Date:** August 13, 2021

| # | Document | Description | Link | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-4/AMEY_B-50_MCC_EXPERIMENT-4.pdf) | [View Code](Virtual%20Lab/Experiment-4/Source%20Code/) |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-4/AMEY_B-50_MCC_EXPERIMENT-4.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 5
     ========================================================================================= -->
## Experiment 5: WML Form Validation for WAP-enabled Phones

Write a program using WML to display user form with validation for WAP-enabled phones

**Date:** August 20, 2021

| # | Program | Description | Source Code | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| 1 | Validation.wml | WML form for student registration | [View](Experiment-5/Validation.wml) | [View Code](Virtual%20Lab/Experiment-5/Source%20Code/) |
| 2 | Validate.wmls | WMLScript for form validation | [View](Experiment-5/Validate.wmls) | — |
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-5/AMEY_B-50_MCC_EXPERIMENT-5.pdf) | — |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-5/AMEY_B-50_MCC_EXPERIMENT-5.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 6
     ========================================================================================= -->
## Experiment 6: WML Calculator and Calendar for Android Phones

Write a program using WML to display a calculator and calendar for android phones

**Date:** August 27, 2021

| # | Program | Description | Source Code | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| 1 | Calculator.wml | WML calculator interface | [View](Experiment-6/Calculator.wml) | [View Code](Virtual%20Lab/Experiment-6/Source%20Code/) |
| 2 | Calculator.wmls | WMLScript calculator logic | [View](Experiment-6/Calculator.wmls) | — |
| 3 | Calendar.wml | WML calendar display | [View](Experiment-6/Calendar.wml) | — |
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-6/AMEY_B-50_MCC_EXPERIMENT-6.pdf) | — |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-6/AMEY_B-50_MCC_EXPERIMENT-6.docx) | — |
| — | Lab Report (PDF) | Frequency Reuse Virtual Lab | [View](Experiment-6/AMEY_B-50_MCC_EXPERIMENT-6A.pdf) | — |
| — | Lab Report (DOCX) | Editable report file (Virtual Lab) | [Download](Experiment-6/AMEY_B-50_MCC_EXPERIMENT-6A.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 7
     ========================================================================================= -->
## Experiment 7: Analyzing Network Packets using Wireshark

Analyze network packets using Wireshark packet analyzer

**Date:** September 17, 2021

| # | Document | Description | Link | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-7/AMEY_B-50_MCC_EXPERIMENT-7.pdf) | [Watch Video](Virtual%20Lab/Experiment-7/Source%20Code/Experiment-7.avi) |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-7/AMEY_B-50_MCC_EXPERIMENT-7.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 8
     ========================================================================================= -->
## Experiment 8: Ubuntu Installation and Wireless Network (MANET) using NS2

Install Ubuntu in VirtualBox and create a small wireless network (MANET) using NS2

**Date:** September 24, 2021

| # | Program | Description | Source Code | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| 1 | manet_simulation.tcl | NS2 TCL script for wireless MANET | [View](Experiment-8/manet_simulation.tcl) | [View Code](Virtual%20Lab/Experiment-8/Source%20Code/) |
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-8/AMEY_B-50_MCC_EXPERIMENT-8.pdf) | — |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-8/AMEY_B-50_MCC_EXPERIMENT-8.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 9
     ========================================================================================= -->
## Experiment 9: Android User Form with Validation

Write a program for android phone display user form and its validation for android phones

**Date:** October 01, 2021

| # | Program | Description | Source Code | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| 1 | strings.xml | Android resource strings | [View](Experiment-9/strings.xml) | [View Code](Virtual%20Lab/Experiment-9/Source%20Code/) |
| 2 | activity_main.xml | Registration form layout | [View](Experiment-9/activity_main.xml) | — |
| 3 | MainActivity.java | Form validation logic | [View](Experiment-9/MainActivity.java) | — |
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-9/AMEY_B-50_MCC_EXPERIMENT-9.pdf) | — |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-9/AMEY_B-50_MCC_EXPERIMENT-9.docx) | — |

---

<!-- =========================================================================================
                                     EXPERIMENT 10
     ========================================================================================= -->
## Experiment 10: Setup and Configuration of Wireless Access Points

Set up and configuration of wireless Access Points using Cisco Packet Tracer

**Date:** October 08, 2021

| # | Document | Description | Link | Virtual Code |
|:-:|:---|:---|:-:|:-:|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-10/AMEY_B-50_MCC_EXPERIMENT-10.pdf) | [View Code](Virtual%20Lab/Experiment-10/Source%20Code/) |
| — | Lab Report (DOCX) | Editable report file | [Download](Experiment-10/AMEY_B-50_MCC_EXPERIMENT-10.docx) | — |

---

<!-- =========================================================================================
                                     FOOTER SECTION
     ========================================================================================= -->
<div align="center">

  <!-- Footer Navigation -->
  [↑ Back to Top](#mobile-application-development-lab)

  [How to Use](#how-to-use) &nbsp;·&nbsp; [Learning Path](#learning-path) &nbsp;·&nbsp; [Experiment 1](#experiment-1-understanding-of-path-loss) &nbsp;·&nbsp; [Experiment 2](#experiment-2-understanding-co-channel-interference-and-sinr) &nbsp;·&nbsp; [Experiment 3](#experiment-3-understanding-cellular-network-frequency-reuse) &nbsp;·&nbsp; [Experiment 4](#experiment-4-understanding-the-handover-mechanism) &nbsp;·&nbsp; [Experiment 5](#experiment-5-wml-form-validation-for-wap-enabled-phones) &nbsp;·&nbsp; [Experiment 6](#experiment-6-wml-calculator-and-calendar-for-android-phones) &nbsp;·&nbsp; [Experiment 7](#experiment-7-analyzing-network-packets-using-wireshark) &nbsp;·&nbsp; [Experiment 8](#experiment-8-ubuntu-installation-and-wireless-network-manet-using-ns2) &nbsp;·&nbsp; [Experiment 9](#experiment-9-android-user-form-with-validation) &nbsp;·&nbsp; [Experiment 10](#experiment-10-setup-and-configuration-of-wireless-access-points)

  <br>

  🏠 **[Back to Main Repository](../)**

</div>

---

<div align="center">

  ### [Mobile Communication and Computing and Mobile Application Development Lab](../)

  **CSL702 · Semester VII · Computer Engineering**

  *University of Mumbai · Curated by [Amey Thakur](https://github.com/Amey-Thakur)*

</div>
