import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Tournaments from './components/Tournaments';

function App() {
  return (
    <Router>
      <div className="App">
        <Routes>
          <Route path="/" element={<Tournaments />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;