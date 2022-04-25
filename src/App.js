import { useState } from 'react';
import { FiSearch } from 'react-icons/fi';
import './estilo.css';
import api from './service/api';


function App() {

    const [input, setInput] = useState ('');
    const [bi, setBi] = useState({});

   async function hendleSearch(){
      // 126789

            if(input === ''){
              alert("Coloque o Bi!")
              return;
            }

                try{
                    const response = await api.get(`${input}`);
                    setBi(response.data) 
                    setInput(" ");

                }catch{
                      alert("Deu Erro!")
                      setInput("")

                }

    }

  return (
    <div className="container">
      <h1 className="title">Procurar Aluno</h1>
       

     <div className="containerInput" >
       
      <input
         type="text"
         placeholder = "Introduza o Bi ... "
         value={input}
         onChange={(e) => setInput(e.target.value)
        }
         />

      <button className="buttonSearch" onClick={hendleSearch}> 
        <FiSearch size={25} color="red"/>
      </button>

     </div> 

            {Object.keys(bi).length > 0 && (


            <main className="main">
                    
                  <h2>BI: {bi.bi} </h2>
                  <span> {bi.name} </span>
                  <span> {bi.email} </span>
                  

            </main>

            

            )}


    </div>



  );
} 

export default App;

