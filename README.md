
# react-native-live-manager

## Getting started

`$ npm install react-native-live-manager --save`

### Mostly automatic installation

`$ react-native link react-native-live-manager`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-live-manager` and add `RNLiveManager.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNLiveManager.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.action98.mssp.fuelgasapp.RNLiveManagerPackage;` to the imports at the top of the file
  - Add `new RNLiveManagerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-live-manager'
  	project(':react-native-live-manager').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-live-manager/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-live-manager')
  	```


## Usage
```javascript
import RNLiveManager from 'react-native-live-manager';

// TODO: What to do with the module?
RNLiveManager;
```
  