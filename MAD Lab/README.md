<!-- =========================================================================================
                                     HEADER SECTION
     ========================================================================================= -->
<div align="center">

  # Mobile Application Development Lab

  ### CSL702 · Semester VII · Computer Engineering

  [![Curated by](https://img.shields.io/badge/Curated%20by-Amey%20Thakur-blue.svg)](https://github.com/Amey-Thakur)
  [![Documents](https://img.shields.io/badge/Documents-10-yellowgreen.svg)](#laboratory-experiments)
  [![Language](https://img.shields.io/badge/Language-Java%20%7C%20XML-blueviolet.svg)](./)

  **A comprehensive collection of laboratory experiments for Mobile Application Development, covering Android UI design, activities, intents, fragments, services, databases, and mobile application architecture.**

  ---

  **[How to Use](#how-to-use)** &nbsp;·&nbsp; **[Learning Path](#learning-path)** &nbsp;·&nbsp; **[Experiment 1](#experiment-1-basic-ui-components)** &nbsp;·&nbsp; **[Experiment 2](#experiment-2-android-layouts)** &nbsp;·&nbsp; **[Experiment 3](#experiment-3-activity-lifecycle)** &nbsp;·&nbsp; **[Experiment 4](#experiment-4-intents--data-passing)** &nbsp;·&nbsp; **[Experiment 5](#experiment-5-listview--adapters)** &nbsp;·&nbsp; **[Experiment 6](#experiment-6-fragments)** &nbsp;·&nbsp; **[Experiment 7](#experiment-7-sqlite-database)** &nbsp;·&nbsp; **[Experiment 8](#experiment-8-shared-preferences)** &nbsp;·&nbsp; **[Experiment 9](#experiment-9-services)** &nbsp;·&nbsp; **[Experiment 10](#experiment-10-broadcast-receivers--notifications)**

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

### Virtual Lab Access
Mobile Application Development experiments can also be accessed through:
- **IIT Kharagpur Virtual Lab**: [http://vlabs.iitkgp.ac.in/fcmc/index.html](http://vlabs.iitkgp.ac.in/fcmc/index.html)

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

### Phase 1: Android Fundamentals
Foundation of Android UI development and basic components.
- **Experiment 1**: Master basic UI components (TextView, Button, EditText, ImageView)
- **Experiment 2**: Understand different layout types (LinearLayout, RelativeLayout, ConstraintLayout)

### Phase 2: User Interaction & Navigation
Managing activities, user input, and navigation flows.
- **Experiment 3**: Learn Activity lifecycle (onCreate, onStart, onResume, onPause, onStop, onDestroy)
- **Experiment 4**: Implement Intents for navigation and data passing between activities
- **Experiment 5**: Create dynamic lists with ListView and custom adapters

### Phase 3: Advanced UI & Data Management
Fragments and data persistence techniques.
- **Experiment 6**: Use Fragments for modular UI components and multi-pane layouts
- **Experiment 7**: Implement SQLite database for structured data storage
- **Experiment 8**: Use SharedPreferences for simple key-value data persistence

### Phase 4: Background Processing & Notifications
Services and broadcast receivers for background operations.
- **Experiment 9**: Create Services for long-running background tasks
- **Experiment 10**: Implement Broadcast Receivers and push notifications

---

<!-- =========================================================================================
                                     EXPERIMENT 1
     ========================================================================================= -->
## Experiment 1: Understanding of Path Loss

Understanding the path loss prediction formula

**Date:** August 06, 2021

| # | Document | Description |
|:-:|:---|:---|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-1/AMEY_B-50_MCC_EXPERIMENT-1.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 2
     ========================================================================================= -->
## Experiment 2: Understanding Co-channel Interference and SINR

Understanding the concept of co-channel interference and SINR (Signal to Interference plus Noise Ratio)

**Date:** July 29, 2021

| # | Document | Description |
|:-:|:---|:---|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-2/AMEY_B-50_MCC_EXPERIMENT-2.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 3
     ========================================================================================= -->
## Experiment 3: Understanding Cellular Network Frequency Reuse

Understanding the cellular network frequency reuse concept - finding co-channel cells and cell clusters

**Date:** July 19, 2021

| # | Document | Description |
|:-:|:---|:---|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-3/AMEY_B-50_MCC_EXPERIMENT-3.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 4
     ========================================================================================= -->
## Experiment 4: Understanding the Handover Mechanism

Understanding the handover mechanism in mobile communication

**Date:** August 13, 2021

| # | Document | Description |
|:-:|:---|:---|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-4/AMEY_B-50_MCC_EXPERIMENT-4.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 5
     ========================================================================================= -->
## Experiment 5: WML Form Validation for WAP-enabled Phones

Write a program using WML to display user form with validation for WAP-enabled phones

**Date:** August 20, 2021

| # | Program | Description | Source Code |
|:-:|:---|:---|:-:|
| 1 | Validation.wml | WML form for student registration | [View](Experiment-5/Validation.wml) |
| 2 | Validate.wmls | WMLScript for form validation | [View](Experiment-5/Validate.wmls) |
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-5/AMEY_B-50_MCC_EXPERIMENT-5.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 6
     ========================================================================================= -->
## Experiment 6: WML Calculator and Calendar for Android Phones

Write a program using WML to display a calculator and calendar for android phones

**Date:** August 27, 2021

| # | Program | Description | Source Code |
|:-:|:---|:---|:-:|
| 1 | Calculator.wml | WML calculator interface | [View](Experiment-6/Calculator.wml) |
| 2 | Calculator.wmls | WMLScript calculator logic | [View](Experiment-6/Calculator.wmls) |
| 3 | Calendar.wml | WML calendar display | [View](Experiment-6/Calendar.wml) |
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-6/AMEY_B-50_MCC_EXPERIMENT-6.pdf) |
| — | Lab Report 6A (PDF) | Frequency Reuse Virtual Lab | [View](Experiment-6/AMEY_B-50_MCC_EXPERIMENT-6A.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 7
     ========================================================================================= -->
## Experiment 7: Analyzing Network Packets using Wireshark

Analyze network packets using Wireshark packet analyzer

**Date:** September 17, 2021

| # | Document | Description |
|:-:|:---|:---|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-7/AMEY_B-50_MCC_EXPERIMENT-7.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 8
     ========================================================================================= -->
## Experiment 8: Ubuntu Installation and Wireless Network (MANET) using NS2

Install Ubuntu in VirtualBox and create a small wireless network (MANET) using NS2

**Date:** September 24, 2021

| # | Program | Description | Source Code |
|:-:|:---|:---|:-:|
| 1 | manet_simulation.tcl | NS2 TCL script for wireless MANET | [View](Experiment-8/manet_simulation.tcl) |
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-8/AMEY_B-50_MCC_EXPERIMENT-8.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 9
     ========================================================================================= -->
## Experiment 9: Android User Form with Validation

Write a program for android phone display user form and its validation for android phones

**Date:** October 01, 2021

| # | Document | Description |
|:-:|:---|:---|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-9/AMEY_B-50_MCC_EXPERIMENT-9.pdf) |

---

<!-- =========================================================================================
                                     EXPERIMENT 10
     ========================================================================================= -->
## Experiment 10: Broadcast Receivers & Notifications

Create an application using Broadcast Receivers and Notifications

| # | Document | Description |
|:-:|:---|:---|
| — | Lab Report (PDF) | Detailed experiment report | [View](Experiment-10/AMEY_B-50_MCC_EXPERIMENT-10.pdf) |

---

<!-- =========================================================================================
                                     FOOTER SECTION
     ========================================================================================= -->
<div align="center">

  <!-- Footer Navigation -->
  **[↑ Back to Top](#mobile-application-development-lab)**

  **[How to Use](#how-to-use)** &nbsp;·&nbsp; **[Learning Path](#learning-path)** &nbsp;·&nbsp; **[Experiment 1](#experiment-1-basic-ui-components)** &nbsp;·&nbsp; **[Experiment 2](#experiment-2-android-layouts)** &nbsp;·&nbsp; **[Experiment 3](#experiment-3-activity-lifecycle)** &nbsp;·&nbsp; **[Experiment 4](#experiment-4-intents--data-passing)** &nbsp;·&nbsp; **[Experiment 5](#experiment-5-listview--adapters)** &nbsp;·&nbsp; **[Experiment 6](#experiment-6-fragments)** &nbsp;·&nbsp; **[Experiment 7](#experiment-7-sqlite-database)** &nbsp;·&nbsp; **[Experiment 8](#experiment-8-shared-preferences)** &nbsp;·&nbsp; **[Experiment 9](#experiment-9-services)** &nbsp;·&nbsp; **[Experiment 10](#experiment-10-broadcast-receivers--notifications)**

  <br>

  **[🏠 Back to Main Repository](../)**

</div>

---

<div align="center">

  ### [Mobile Communication and Computing and Mobile Application Development Lab](https://github.com/Amey-Thakur/MOBILE-COMMUNICATION-AND-COMPUTING-AND-MOBILE-APPLICATION-DEVELOPMENT-LAB)

  **CSL702 · Semester VII · Computer Engineering**

  *University of Mumbai · Curated by [Amey Thakur](https://github.com/Amey-Thakur)*

</div>
