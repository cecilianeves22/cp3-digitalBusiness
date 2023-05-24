import React, { useEffect, useState } from 'react';
import axios from 'axios';
import CachorrosForm from './CachorrosForm';
import { useParams } from 'react-router-dom';


const CachorrosEdit = ({ match, history }) => {
  const [Cachorros, setCachorros] = useState(null);

  useEffect(() => {
    async function fetchCachorros() {
      try {
        const response = await axios.get(
          `http://localhost:8080/api/cachorros`
        );
        setCachorros(response.data);
      } catch (error) {
        console.error(error);
      }
    };

    fetchCachorros();

  }, []);
  

  const updateCachorros = async (updatedCachorros) => {
    try {
      await axios.put(
        `http://localhost:8080/api/cachorrosUpdate`,
        updatedCachorros
      );
      history.push('/');
    } catch (error) {
      console.error(error);
    }
  };

  return (
    <div>
      <h1>Editar Adoção</h1>
      {Cachorros ? (
        <CachorrosForm initialValues={Cachorros} onSubmit={updateCachorros} />
      ) : (
        <p>Carregando...</p>
      )}
    </div>
  );
};

export default CachorrosEdit;
